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
 * ListeTypesLexicaux generated by hbm2java
 */
@Entity
@Table(name = "liste_types_lexicaux", catalog = "bddictionnairique")
public class ListeTypesLexicaux implements java.io.Serializable {

	private Integer idTypeLexical;
	private String typeLexical;
	private Set lexiques = new HashSet(0);

	public ListeTypesLexicaux() {
	}

	public ListeTypesLexicaux(String typeLexical, Set lexiques) {
		this.typeLexical = typeLexical;
		this.lexiques = lexiques;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_type_lexical", unique = true, nullable = false)
	public Integer getIdTypeLexical() {
		return this.idTypeLexical;
	}

	public void setIdTypeLexical(Integer idTypeLexical) {
		this.idTypeLexical = idTypeLexical;
	}

	@Column(name = "type_lexical", length = 15)
	public String getTypeLexical() {
		return this.typeLexical;
	}

	public void setTypeLexical(String typeLexical) {
		this.typeLexical = typeLexical;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeTypesLexicaux")
	public Set getLexiques() {
		return this.lexiques;
	}

	public void setLexiques(Set lexiques) {
		this.lexiques = lexiques;
	}

}
