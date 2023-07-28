package orders.enterprise;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enterprise/customers/{customerId}/orders")
public class EnterpriseOrderController {
	 @PostMapping
	    public Order createOrder(@PathVariable long customerId, @RequestBody Order order) {
	        // Implement logic to create a new order for the given customerId
	        // For simplicity, let's assume we just return the input order
	        order.setCustomerId(customerId);
	        return order;
	    }

	    @PutMapping("/{orderId}")
	    public Order updateOrder(@PathVariable long customerId, @PathVariable long orderId, @RequestBody Order order) {
	        // Implement logic to update an existing order by ID for the given customerId
	        // For simplicity, let's assume we just return the updated order
	        order.setCustomerId(customerId);
	        order.setId(orderId);
	        return order;
	    }

	    @GetMapping
	    public List<Order> getCustomerOrders(@PathVariable long customerId) {
	        // Implement logic to fetch all orders for the given customerId
	        // For simplicity, let's assume there's a list containing the orders
	        // You can filter the list based on customerId and return only orders belonging to that customer
	        return orderList;
	    }

	    @GetMapping("/{orderId}")
	    public Order getOrder(@PathVariable long orderId) {
	        // Implement logic to fetch an order by ID
	        // For simplicity, let's assume we just return the order with the given ID
	        return order;
	    }
}
