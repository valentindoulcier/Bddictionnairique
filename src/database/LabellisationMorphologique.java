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
 * LabellisationMorphologique generated by hbm2java
 */
@Entity
@Table(name = "labellisation_morphologique", catalog = "bddictionnairique")
public class LabellisationMorphologique implements java.io.Serializable {

	private Integer idLabelMorph;
	private TypesMorphologie typesMorphologieByM2;
	private TypesMorphologie typesMorphologieByM3;
	private TypesMorphologie typesMorphologieByM1;
	private TypesMorphologie typesMorphologieByM6;
	private TypesMorphologie typesMorphologieByM7;
	private TypesMorphologie typesMorphologieByM4;
	private TypesMorphologie typesMorphologieByM5;
	private TypesMorphologie typesMorphologieByM9;
	private TypesMorphologie typesMorphologieByM8;
	private TypesMorphologie typesMorphologieByM10;
	private int idMorph;
	private String note;

	public LabellisationMorphologique() {
	}

	public LabellisationMorphologique(int idMorph) {
		this.idMorph = idMorph;
	}

	public LabellisationMorphologique(TypesMorphologie typesMorphologieByM2,
			TypesMorphologie typesMorphologieByM3,
			TypesMorphologie typesMorphologieByM1,
			TypesMorphologie typesMorphologieByM6,
			TypesMorphologie typesMorphologieByM7,
			TypesMorphologie typesMorphologieByM4,
			TypesMorphologie typesMorphologieByM5,
			TypesMorphologie typesMorphologieByM9,
			TypesMorphologie typesMorphologieByM8,
			TypesMorphologie typesMorphologieByM10, int idMorph, String note) {
		this.typesMorphologieByM2 = typesMorphologieByM2;
		this.typesMorphologieByM3 = typesMorphologieByM3;
		this.typesMorphologieByM1 = typesMorphologieByM1;
		this.typesMorphologieByM6 = typesMorphologieByM6;
		this.typesMorphologieByM7 = typesMorphologieByM7;
		this.typesMorphologieByM4 = typesMorphologieByM4;
		this.typesMorphologieByM5 = typesMorphologieByM5;
		this.typesMorphologieByM9 = typesMorphologieByM9;
		this.typesMorphologieByM8 = typesMorphologieByM8;
		this.typesMorphologieByM10 = typesMorphologieByM10;
		this.idMorph = idMorph;
		this.note = note;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_label_morph", unique = true, nullable = false)
	public Integer getIdLabelMorph() {
		return this.idLabelMorph;
	}

	public void setIdLabelMorph(Integer idLabelMorph) {
		this.idLabelMorph = idLabelMorph;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m2")
	public TypesMorphologie getTypesMorphologieByM2() {
		return this.typesMorphologieByM2;
	}

	public void setTypesMorphologieByM2(TypesMorphologie typesMorphologieByM2) {
		this.typesMorphologieByM2 = typesMorphologieByM2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m3")
	public TypesMorphologie getTypesMorphologieByM3() {
		return this.typesMorphologieByM3;
	}

	public void setTypesMorphologieByM3(TypesMorphologie typesMorphologieByM3) {
		this.typesMorphologieByM3 = typesMorphologieByM3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m1")
	public TypesMorphologie getTypesMorphologieByM1() {
		return this.typesMorphologieByM1;
	}

	public void setTypesMorphologieByM1(TypesMorphologie typesMorphologieByM1) {
		this.typesMorphologieByM1 = typesMorphologieByM1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m6")
	public TypesMorphologie getTypesMorphologieByM6() {
		return this.typesMorphologieByM6;
	}

	public void setTypesMorphologieByM6(TypesMorphologie typesMorphologieByM6) {
		this.typesMorphologieByM6 = typesMorphologieByM6;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m7")
	public TypesMorphologie getTypesMorphologieByM7() {
		return this.typesMorphologieByM7;
	}

	public void setTypesMorphologieByM7(TypesMorphologie typesMorphologieByM7) {
		this.typesMorphologieByM7 = typesMorphologieByM7;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m4")
	public TypesMorphologie getTypesMorphologieByM4() {
		return this.typesMorphologieByM4;
	}

	public void setTypesMorphologieByM4(TypesMorphologie typesMorphologieByM4) {
		this.typesMorphologieByM4 = typesMorphologieByM4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m5")
	public TypesMorphologie getTypesMorphologieByM5() {
		return this.typesMorphologieByM5;
	}

	public void setTypesMorphologieByM5(TypesMorphologie typesMorphologieByM5) {
		this.typesMorphologieByM5 = typesMorphologieByM5;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m9")
	public TypesMorphologie getTypesMorphologieByM9() {
		return this.typesMorphologieByM9;
	}

	public void setTypesMorphologieByM9(TypesMorphologie typesMorphologieByM9) {
		this.typesMorphologieByM9 = typesMorphologieByM9;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m8")
	public TypesMorphologie getTypesMorphologieByM8() {
		return this.typesMorphologieByM8;
	}

	public void setTypesMorphologieByM8(TypesMorphologie typesMorphologieByM8) {
		this.typesMorphologieByM8 = typesMorphologieByM8;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m10")
	public TypesMorphologie getTypesMorphologieByM10() {
		return this.typesMorphologieByM10;
	}

	public void setTypesMorphologieByM10(TypesMorphologie typesMorphologieByM10) {
		this.typesMorphologieByM10 = typesMorphologieByM10;
	}

	@Column(name = "id_morph", nullable = false)
	public int getIdMorph() {
		return this.idMorph;
	}

	public void setIdMorph(int idMorph) {
		this.idMorph = idMorph;
	}

	@Column(name = "note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
