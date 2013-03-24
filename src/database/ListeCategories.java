package database;

// Generated 25 janv. 2013 00:04:50 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ListeCategories generated by hbm2java
 */
@Entity
@Table(name = "liste_categories", catalog = "bddictionnairique")
public class ListeCategories implements java.io.Serializable {

	private Integer idCategorie;
	private String nom;
	private Set avoirPourSuffixesesForIdCategorieArrivee = new HashSet(0);
	private Set avoirPourCategorieHeadwords = new HashSet(0);
	private Set avoirPourSuffixesesForIdCategorieDepart = new HashSet(0);
	private Set avoirPourPrefixeBases = new HashSet(0);

	public ListeCategories() {
	}

	public ListeCategories(String nom,
			Set avoirPourSuffixesesForIdCategorieArrivee,
			Set avoirPourCategorieHeadwords,
			Set avoirPourSuffixesesForIdCategorieDepart,
			Set avoirPourPrefixeBases) {
		this.nom = nom;
		this.avoirPourSuffixesesForIdCategorieArrivee = avoirPourSuffixesesForIdCategorieArrivee;
		this.avoirPourCategorieHeadwords = avoirPourCategorieHeadwords;
		this.avoirPourSuffixesesForIdCategorieDepart = avoirPourSuffixesesForIdCategorieDepart;
		this.avoirPourPrefixeBases = avoirPourPrefixeBases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_categorie", unique = true, nullable = false)
	public Integer getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Column(name = "nom", length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCategoriesByIdCategorieArrivee")
	public Set getAvoirPourSuffixesesForIdCategorieArrivee() {
		return this.avoirPourSuffixesesForIdCategorieArrivee;
	}

	public void setAvoirPourSuffixesesForIdCategorieArrivee(
			Set avoirPourSuffixesesForIdCategorieArrivee) {
		this.avoirPourSuffixesesForIdCategorieArrivee = avoirPourSuffixesesForIdCategorieArrivee;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCategories")
	public Set getAvoirPourCategorieHeadwords() {
		return this.avoirPourCategorieHeadwords;
	}

	public void setAvoirPourCategorieHeadwords(Set avoirPourCategorieHeadwords) {
		this.avoirPourCategorieHeadwords = avoirPourCategorieHeadwords;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCategoriesByIdCategorieDepart")
	public Set getAvoirPourSuffixesesForIdCategorieDepart() {
		return this.avoirPourSuffixesesForIdCategorieDepart;
	}

	public void setAvoirPourSuffixesesForIdCategorieDepart(
			Set avoirPourSuffixesesForIdCategorieDepart) {
		this.avoirPourSuffixesesForIdCategorieDepart = avoirPourSuffixesesForIdCategorieDepart;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCategories")
	public Set getAvoirPourPrefixeBases() {
		return this.avoirPourPrefixeBases;
	}

	public void setAvoirPourPrefixeBases(Set avoirPourPrefixeBases) {
		this.avoirPourPrefixeBases = avoirPourPrefixeBases;
	}

}
