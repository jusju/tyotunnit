package fi.haagahelia.tyotunnit.bean;

public class Henkilo {
	private int id;
	private String kayttajatunnus;
	private String salasana;
	
	public Henkilo() {
		super();
	}

	public Henkilo(int id, String kayttajatunnus, String salasana) {
		super();
		this.id = id;
		this.kayttajatunnus = kayttajatunnus;
		this.salasana = salasana;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}
	
}
