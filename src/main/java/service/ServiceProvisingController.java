package service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service")
public class ServiceProvisingController {
	

	    @PostMapping("/provision")
	    public ResponseEntity<ServiceProvisioning> enableServiceConnection(@RequestBody ServiceProvisioning serviceProvisioning) {
	        // Implement logic to enable wireless service connection
	        // For simplicity, let's assume we just return the input serviceProvisioning
	        return new ResponseEntity<>(serviceProvisioning, HttpStatus.CREATED);
	    }

	    @PostMapping("/test-qos")
	    public ResponseEntity<ServiceProvisioning> testQOS(@RequestBody ServiceProvisioning serviceProvisioning) {
	        // Implement logic to test QOS for a device
	        // For simplicity, let's assume we just return the input serviceProvisioning
	        return new ResponseEntity<>(serviceProvisioning, HttpStatus.CREATED);
	    }

	    @PutMapping("/disable/{connectionId}")
	    public ResponseEntity<ServiceProvisioning> disableConnection(@PathVariable long connectionId) {
	        // Implement logic to disable a connection by connectionId
	        // For simplicity, let's assume we just set the "enabled" field to false
	        ServiceProvisioning serviceProvisioning = getServiceProvisioningById(connectionId);
	        if (serviceProvisioning != null) {
	            serviceProvisioning.setEnabled(false);
	            return new ResponseEntity<>(serviceProvisioning, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PutMapping("/hold/{connectionId}")
	    public ResponseEntity<ServiceProvisioning> holdConnection(@PathVariable long connectionId) {
	        // Implement logic to put a connection on hold by connectionId
	        // For simplicity, let's assume we just set the "enabled" field to false (hold state)
	        ServiceProvisioning serviceProvisioning = getServiceProvisioningById(connectionId);
	        if (serviceProvisioning != null) {
	            serviceProvisioning.setEnabled(false);
	            return new ResponseEntity<>(serviceProvisioning, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PutMapping("/resume/{connectionId}")
	    public ResponseEntity<ServiceProvisioning> resumeConnection(@PathVariable long connectionId) {
	        // Implement logic to resume a connection by connectionId
	        // For simplicity, let's assume we just set the "enabled" field to true (resume connection)
	        ServiceProvisioning serviceProvisioning = getServiceProvisioningById(connectionId);
	        if (serviceProvisioning != null) {
	            serviceProvisioning.setEnabled(true);
	            return new ResponseEntity<>(serviceProvisioning, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // Helper method to fetch ServiceProvisioning by ID (Replace this with database fetch)
	    private ServiceProvisioning getServiceProvisioningById(long connectionId) {
	        // Implement logic to fetch ServiceProvisioning from the database or any other storage based on the connectionId
	        // For simplicity, let's assume we have a list containing ServiceProvisioning items
	        List<ServiceProvisioning> serviceProvisioningList = new ArrayList<>();
	        // Fill the list with your data or fetch it from a database
	        // For this example, we assume the list contains some sample data
	        // Replace this with your actual data fetching logic
	        // Below is a dummy implementation
	        serviceProvisioningList.add(new ServiceProvisioning(1L, "Wireless", true, true));
	        serviceProvisioningList.add(new ServiceProvisioning(2L, "Wireless", true, false));
	        // Find the ServiceProvisioning item with the given connectionId
	        for (ServiceProvisioning provisioning : serviceProvisioningList) {
	            if (provisioning.getConnectionId() == connectionId) {
	                return provisioning;
	            }
	        }
	        // If no item found with the given connectionId, return null
	        return null;
	    }
	}

}
}
