package pe.apirestoracle.entity;

import java.util.Date;

public class Ventas {
	private int idventas;
	private Date fecha;
	private String tipodoc;
	private String numdoc;
	private int idpersona;
	private int idusuario;
	public Ventas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ventas(int idventas, Date fecha, String tipodoc, String numdoc, int idpersona, int idusuario) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	

}
