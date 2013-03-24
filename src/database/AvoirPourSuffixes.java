package database;

// Generated 25 janv. 2013 00:04:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AvoirPourSuffixes generated by hbm2java
 */
@Entity
@Table(name = "avoir_pour_suffixes", catalog = "bddictionnairique")
public class AvoirPourSuffixes implements java.io.Serializable {

	private AvoirPourSuffixesId id;
	private ListeCategories listeCategoriesByIdCategorieArrivee;
	private ListeMorphemesPrefsuffbase listeMorphemesPrefsuffbase;
	private ListeCategories listeCategoriesByIdCategorieDepart;

	public AvoirPourSuffixes() {
	}

	public AvoirPourSuffixes(AvoirPourSuffixesId id,
			ListeCategories listeCategoriesByIdCategorieArrivee,
			ListeMorphemesPrefsuffbase listeMorphemesPrefsuffbase,
			ListeCategories listeCategoriesByIdCategorieDepart) {
		this.id = id;
		this.listeCategoriesByIdCategorieArrivee = listeCategoriesByIdCategorieArrivee;
		this.listeMorphemesPrefsuffbase = listeMorphemesPrefsuffbase;
		this.listeCategoriesByIdCategorieDepart = listeCategoriesByIdCategorieDepart;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCategorieDepart", column = @Column(name = "id_categorie_depart", nullable = false)),
			@AttributeOverride(name = "idCategorieArrivee", column = @Column(name = "id_categorie_arrivee", nullable = false)),
			@AttributeOverride(name = "idMorphPrefsuffbase", column = @Column(name = "id_morph_prefsuffbase", nullable = false)) })
	public AvoirPourSuffixesId getId() {
		return this.id;
	}

	public void setId(AvoirPourSuffixesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categorie_arrivee", nullable = false, insertable = false, updatable = false)
	public ListeCategories getListeCategoriesByIdCategorieArrivee() {
		return this.listeCategoriesByIdCategorieArrivee;
	}

	public void setListeCategoriesByIdCategorieArrivee(
			ListeCategories listeCategoriesByIdCategorieArrivee) {
		this.listeCategoriesByIdCategorieArrivee = listeCategoriesByIdCategorieArrivee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_morph_prefsuffbase", nullable = false, insertable = false, updatable = false)
	public ListeMorphemesPrefsuffbase getListeMorphemesPrefsuffbase() {
		return this.listeMorphemesPrefsuffbase;
	}

	public void setListeMorphemesPrefsuffbase(
			ListeMorphemesPrefsuffbase listeMorphemesPrefsuffbase) {
		this.listeMorphemesPrefsuffbase = listeMorphemesPrefsuffbase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categorie_depart", nullable = false, insertable = false, updatable = false)
	public ListeCategories getListeCategoriesByIdCategorieDepart() {
		return this.listeCategoriesByIdCategorieDepart;
	}

	public void setListeCategoriesByIdCategorieDepart(
			ListeCategories listeCategoriesByIdCategorieDepart) {
		this.listeCategoriesByIdCategorieDepart = listeCategoriesByIdCategorieDepart;
	}

}