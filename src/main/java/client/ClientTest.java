package client;

import customers.CustomerPort;
import customers.CustomerPortService;
import customers.GetCustomerDetailRequest;
import customers.GetCustomerDetailResponse;

public class ClientTest {
	public static void main(String[] args) {
		CustomerPortService service = new CustomerPortService();
		HeaderHandleResolver handlerResolver = new HeaderHandleResolver();
		service.setHandlerResolver(handlerResolver);
		CustomerPort customerPort =service.getCustomerPortSoap11();
		
		GetCustomerDetailRequest customerDetailRequest = new GetCustomerDetailRequest();
		customerDetailRequest.setId(2);
		
		GetCustomerDetailResponse customerDetailResponse = customerPort.getCustomerDetail(customerDetailRequest);
		
		System.out.println("id: " + customerDetailResponse.getCustomerDetail().getId());
		System.out.println("name: " + customerDetailResponse.getCustomerDetail().getName());
		System.out.println("email: " + customerDetailResponse.getCustomerDetail().getEmail());
		System.out.println("phone: " + customerDetailResponse.getCustomerDetail().getPhone());
	}
}
