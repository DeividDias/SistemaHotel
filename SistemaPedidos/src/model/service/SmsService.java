package model.service;

import model.domain.Sms;
import model.domain.StatusSms;

public interface SmsService {

	Integer enviarSms(Sms sms);

	StatusSms getStatusSms(Integer codigoSms);

}
