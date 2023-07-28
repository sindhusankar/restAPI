package catalog;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class CatalogItem {
	private int id;
    private String name;
    CatalogItem(){}
    public int getId()
    {
    	return this.id;
    }
 public String getNAme()
 {
	 return this.name;

 }
 CatalogItem (String name)
 {
	 this.name=name;
 }
 CatalogItem(String name,int userid)
 {
	 this.name=name;
	 this.id=userid;
 }
 public void test()
 {
	 System.out.println("Test Method");
 }
 ArrayList<String>getCatalogList(){
	 ArrayList<String> data=new ArrayList<String>();
	 data.add("Food");
	 data.add("Dosa");
	return data;
	 
 }
}


    
