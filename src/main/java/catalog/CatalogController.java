package catalog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
	@GetMapping("/api/catalog")
	@ResponseBody
	//@RequestMapping("/api/catalog")

	 //Method
	 public ArrayList<String> getCatalog()
	 {
		CatalogItem e =new CatalogItem(null);
		return e.getCatalogList();
	 }
	 
@PostMapping("/api/catalog")
  String postCatalog(@RequestBody String data) {
   return "Data posted" +data;
}
@PostMapping("/api/catalog2")
   String postCatalog2(@RequestBody CatalogItem data) {
 return("Data posted" +data.getId()+" "+data.getNAme());

 }

@PostMapping("/api/catalog3")
String postCatalog3(@RequestBody List<CatalogItem> data) {
return("Data posted" +data.get(0).getId()+" "+data.get(1).getId());

}
   @PutMapping("/api/catalog/{id}")
    String putCatalog(@PathVariable int id) {
     return "Data posted" +id;
    }
    
    
     @DeleteMapping("/api/catalog/{id}")
     boolean deleteCatalog(@PathVariable int id) {
      return true;
}}
