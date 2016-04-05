package model.facade.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.domain.Sms;
import model.domain.StatusSms;
import model.service.SmsService;

@Path("/sms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SmsFacade {

	private SmsService smsService;
	
	@POST
	public Integer enviarSms(Sms sms){
		return smsService.enviarSms(sms);
	}

	@GET
	@Path("{codigoSms}")
	public StatusSms getStatusSms(@PathParam("codigoSms") Integer codigoSms){
		return smsService.getStatusSms(codigoSms);
	}
}
