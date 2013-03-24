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
 * ListeMorphemesPrefsuffbase generated by hbm2java
 */
@Entity
@Table(name = "liste_morphemes_prefsuffbase", catalog = "bddictionnairique")
public class ListeMorphemesPrefsuffbase implements java.io.Serializable {

	private Integer idMorphPrefsuffbase;
	private String type;
	private String origine;
	private String contenu;
	private Set avoirPourSuffixeses = new HashSet(0);
	private Set avoirPourPrefixeBases = new HashSet(0);
	private Set listeAllomorpheses = new HashSet(0);

	public ListeMorphemesPrefsuffbase() {
	}

	public ListeMorphemesPrefsuffbase(String type, String origine,
			String contenu, Set avoirPourSuffixeses, Set avoirPourPrefixeBases,
			Set listeAllomorpheses) {
		this.type = type;
		this.origine = origine;
		this.contenu = contenu;
		this.avoirPourSuffixeses = avoirPourSuffixeses;
		this.avoirPourPrefixeBases = avoirPourPrefixeBases;
		this.listeAllomorpheses = listeAllomorpheses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_morph_prefsuffbase", unique = true, nullable = false)
	public Integer getIdMorphPrefsuffbase() {
		return this.idMorphPrefsuffbase;
	}

	public void setIdMorphPrefsuffbase(Integer idMorphPrefsuffbase) {
		this.idMorphPrefsuffbase = idMorphPrefsuffbase;
	}

	@Column(name = "type", length = 15)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "origine", length = 25)
	public String getOrigine() {
		return this.origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	@Column(name = "contenu", length = 50)
	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeMorphemesPrefsuffbase")
	public Set getAvoirPourSuffixeses() {
		return this.avoirPourSuffixeses;
	}

	public void setAvoirPourSuffixeses(Set avoirPourSuffixeses) {
		this.avoirPourSuffixeses = avoirPourSuffixeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeMorphemesPrefsuffbase")
	public Set getAvoirPourPrefixeBases() {
		return this.avoirPourPrefixeBases;
	}

	public void setAvoirPourPrefixeBases(Set avoirPourPrefixeBases) {
		this.avoirPourPrefixeBases = avoirPourPrefixeBases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeMorphemesPrefsuffbase")
	public Set getListeAllomorpheses() {
		return this.listeAllomorpheses;
	}

	public void setListeAllomorpheses(Set listeAllomorpheses) {
		this.listeAllomorpheses = listeAllomorpheses;
	}

}
