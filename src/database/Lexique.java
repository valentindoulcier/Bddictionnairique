package database;

// Generated 25 janv. 2013 00:04:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Lexique generated by hbm2java
 */
@Entity
@Table(name = "lexique", catalog = "bddictionnairique")
public class Lexique implements java.io.Serializable {

	private Integer idLienLex;
	private LiensDict liensDictByIdLienDictMotEtudie;
	private LiensDict liensDictByIdLienDictMotReferent1;
	private LiensDict liensDictByIdLienDictMotReferent2;
	private TypesConstruction typesConstruction;
	private ListeTypesLexicaux listeTypesLexicaux;
	private ListeStatuts listeStatuts;
	private String note;

	public Lexique() {
	}

	public Lexique(LiensDict liensDictByIdLienDictMotEtudie,
			LiensDict liensDictByIdLienDictMotReferent1,
			LiensDict liensDictByIdLienDictMotReferent2,
			TypesConstruction typesConstruction,
			ListeTypesLexicaux listeTypesLexicaux, ListeStatuts listeStatuts) {
		this.liensDictByIdLienDictMotEtudie = liensDictByIdLienDictMotEtudie;
		this.liensDictByIdLienDictMotReferent1 = liensDictByIdLienDictMotReferent1;
		this.liensDictByIdLienDictMotReferent2 = liensDictByIdLienDictMotReferent2;
		this.typesConstruction = typesConstruction;
		this.listeTypesLexicaux = listeTypesLexicaux;
		this.listeStatuts = listeStatuts;
	}

	public Lexique(LiensDict liensDictByIdLienDictMotEtudie,
			LiensDict liensDictByIdLienDictMotReferent1,
			LiensDict liensDictByIdLienDictMotReferent2,
			TypesConstruction typesConstruction,
			ListeTypesLexicaux listeTypesLexicaux, ListeStatuts listeStatuts,
			String note) {
		this.liensDictByIdLienDictMotEtudie = liensDictByIdLienDictMotEtudie;
		this.liensDictByIdLienDictMotReferent1 = liensDictByIdLienDictMotReferent1;
		this.liensDictByIdLienDictMotReferent2 = liensDictByIdLienDictMotReferent2;
		this.typesConstruction = typesConstruction;
		this.listeTypesLexicaux = listeTypesLexicaux;
		this.listeStatuts = listeStatuts;
		this.note = note;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_lien_lex", unique = true, nullable = false)
	public Integer getIdLienLex() {
		return this.idLienLex;
	}

	public void setIdLienLex(Integer idLienLex) {
		this.idLienLex = idLienLex;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_lien_dict_mot_etudie", nullable = false)
	public LiensDict getLiensDictByIdLienDictMotEtudie() {
		return this.liensDictByIdLienDictMotEtudie;
	}

	public void setLiensDictByIdLienDictMotEtudie(
			LiensDict liensDictByIdLienDictMotEtudie) {
		this.liensDictByIdLienDictMotEtudie = liensDictByIdLienDictMotEtudie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_lien_dict_mot_referent1", nullable = false)
	public LiensDict getLiensDictByIdLienDictMotReferent1() {
		return this.liensDictByIdLienDictMotReferent1;
	}

	public void setLiensDictByIdLienDictMotReferent1(
			LiensDict liensDictByIdLienDictMotReferent1) {
		this.liensDictByIdLienDictMotReferent1 = liensDictByIdLienDictMotReferent1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_lien_dict_mot_referent2", nullable = false)
	public LiensDict getLiensDictByIdLienDictMotReferent2() {
		return this.liensDictByIdLienDictMotReferent2;
	}

	public void setLiensDictByIdLienDictMotReferent2(
			LiensDict liensDictByIdLienDictMotReferent2) {
		this.liensDictByIdLienDictMotReferent2 = liensDictByIdLienDictMotReferent2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_construction", nullable = false)
	public TypesConstruction getTypesConstruction() {
		return this.typesConstruction;
	}

	public void setTypesConstruction(TypesConstruction typesConstruction) {
		this.typesConstruction = typesConstruction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type_lexical", nullable = false)
	public ListeTypesLexicaux getListeTypesLexicaux() {
		return this.listeTypesLexicaux;
	}

	public void setListeTypesLexicaux(ListeTypesLexicaux listeTypesLexicaux) {
		this.listeTypesLexicaux = listeTypesLexicaux;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_statut", nullable = false)
	public ListeStatuts getListeStatuts() {
		return this.listeStatuts;
	}

	public void setListeStatuts(ListeStatuts listeStatuts) {
		this.listeStatuts = listeStatuts;
	}

	@Column(name = "note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
