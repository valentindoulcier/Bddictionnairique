package database;

// Generated 25 janv. 2013 00:04:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AvoirPourSuffixesId generated by hbm2java
 */
@Embeddable
public class AvoirPourSuffixesId implements java.io.Serializable {

	private int idCategorieDepart;
	private int idCategorieArrivee;
	private int idMorphPrefsuffbase;

	public AvoirPourSuffixesId() {
	}

	public AvoirPourSuffixesId(int idCategorieDepart, int idCategorieArrivee,
			int idMorphPrefsuffbase) {
		this.idCategorieDepart = idCategorieDepart;
		this.idCategorieArrivee = idCategorieArrivee;
		this.idMorphPrefsuffbase = idMorphPrefsuffbase;
	}

	@Column(name = "id_categorie_depart", nullable = false)
	public int getIdCategorieDepart() {
		return this.idCategorieDepart;
	}

	public void setIdCategorieDepart(int idCategorieDepart) {
		this.idCategorieDepart = idCategorieDepart;
	}

	@Column(name = "id_categorie_arrivee", nullable = false)
	public int getIdCategorieArrivee() {
		return this.idCategorieArrivee;
	}

	public void setIdCategorieArrivee(int idCategorieArrivee) {
		this.idCategorieArrivee = idCategorieArrivee;
	}

	@Column(name = "id_morph_prefsuffbase", nullable = false)
	public int getIdMorphPrefsuffbase() {
		return this.idMorphPrefsuffbase;
	}

	public void setIdMorphPrefsuffbase(int idMorphPrefsuffbase) {
		this.idMorphPrefsuffbase = idMorphPrefsuffbase;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AvoirPourSuffixesId))
			return false;
		AvoirPourSuffixesId castOther = (AvoirPourSuffixesId) other;

		return (this.getIdCategorieDepart() == castOther.getIdCategorieDepart())
				&& (this.getIdCategorieArrivee() == castOther
						.getIdCategorieArrivee())
				&& (this.getIdMorphPrefsuffbase() == castOther
						.getIdMorphPrefsuffbase());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCategorieDepart();
		result = 37 * result + this.getIdCategorieArrivee();
		result = 37 * result + this.getIdMorphPrefsuffbase();
		return result;
	}

}