/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

/**
 *
 * @author Duc Thang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duc Thang
 */
import java.util.ArrayList;
import java.util.List;

public class ManagerDoccument {

    List<Document> documents;

    public ManagerDoccument() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof NewsPaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.documents.stream().filter(doc -> doc instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
    }

}

