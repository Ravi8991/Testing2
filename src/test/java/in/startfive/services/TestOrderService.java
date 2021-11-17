package in.startfive.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class TestOrderService {

	private SMSService sMSService = mock(SMSService.class);
	
	//if any of the method not stubbed wil call real method
	//spy is partial mock
	private EmailService emailService = spy(EmailService.class);
    
	private OrderService orderService;

	@Test
	public void testplaceorder() {
		orderService = new  OrderService(sMSService, emailService);
		doReturn(true).when(emailService).sendEmail();
		when(sMSService.sendSMS()).thenReturn(true);
		
		assertEquals(1, orderService.placeOrder());
		verify(sMSService, times(1)).sendSMS();

	}

}
