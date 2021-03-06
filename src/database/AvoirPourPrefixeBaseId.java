package database;

// Generated 25 janv. 2013 00:04:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AvoirPourPrefixeBaseId generated by hbm2java
 */
@Embeddable
public class AvoirPourPrefixeBaseId implements java.io.Serializable {

	private int idCategorie;
	private int idMorphPrefsuffbase;

	public AvoirPourPrefixeBaseId() {
	}

	public AvoirPourPrefixeBaseId(int idCategorie, int idMorphPrefsuffbase) {
		this.idCategorie = idCategorie;
		this.idMorphPrefsuffbase = idMorphPrefsuffbase;
	}

	@Column(name = "id_categorie", nullable = false)
	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
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
		if (!(other instanceof AvoirPourPrefixeBaseId))
			return false;
		AvoirPourPrefixeBaseId castOther = (AvoirPourPrefixeBaseId) other;

		return (this.getIdCategorie() == castOther.getIdCategorie())
				&& (this.getIdMorphPrefsuffbase() == castOther
						.getIdMorphPrefsuffbase());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCategorie();
		result = 37 * result + this.getIdMorphPrefsuffbase();
		return result;
	}

}
