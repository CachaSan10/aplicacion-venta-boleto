package ar.proyecto.boleto.service;

public interface IEmailService {

	public void sendEmail(String correoDestino, String titulo, String cuerpo);
}
