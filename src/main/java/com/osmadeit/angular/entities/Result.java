/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.angular.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author litem
 */
@Entity
@Table(name = "result", catalog = "schools", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Result.findAll", query = "SELECT r FROM Result r")
    , @NamedQuery(name = "Result.findById", query = "SELECT r FROM Result r WHERE r.id = :id")
    , @NamedQuery(name = "Result.findByMath", query = "SELECT r FROM Result r WHERE r.math = :math")
    , @NamedQuery(name = "Result.findByEnglish", query = "SELECT r FROM Result r WHERE r.english = :english")
    , @NamedQuery(name = "Result.findByKiswahili", query = "SELECT r FROM Result r WHERE r.kiswahili = :kiswahili")
    , @NamedQuery(name = "Result.findByBiology", query = "SELECT r FROM Result r WHERE r.biology = :biology")
    , @NamedQuery(name = "Result.findByChemistry", query = "SELECT r FROM Result r WHERE r.chemistry = :chemistry")
    , @NamedQuery(name = "Result.findByPhysics", query = "SELECT r FROM Result r WHERE r.physics = :physics")
    , @NamedQuery(name = "Result.findByAgriculture", query = "SELECT r FROM Result r WHERE r.agriculture = :agriculture")
    , @NamedQuery(name = "Result.findByGeography", query = "SELECT r FROM Result r WHERE r.geography = :geography")
    , @NamedQuery(name = "Result.findByComputerStudies", query = "SELECT r FROM Result r WHERE r.computerStudies = :computerStudies")
    , @NamedQuery(name = "Result.findByTotalMark", query = "SELECT r FROM Result r WHERE r.totalMark = :totalMark")
    , @NamedQuery(name = "Result.findByMeanMark", query = "SELECT r FROM Result r WHERE r.meanMark = :meanMark")
    , @NamedQuery(name = "Result.findByMeanGrade", query = "SELECT r FROM Result r WHERE r.meanGrade = :meanGrade")})
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "math", nullable = false)
    private float math;
    @Basic(optional = false)
    @NotNull
    @Column(name = "english", nullable = false)
    private float english;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kiswahili", nullable = false)
    private float kiswahili;
    @Basic(optional = false)
    @NotNull
    @Column(name = "biology", nullable = false)
    private float biology;
    @Basic(optional = false)
    @NotNull
    @Column(name = "chemistry", nullable = false)
    private float chemistry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physics", nullable = false)
    private float physics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agriculture", nullable = false)
    private float agriculture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geography", nullable = false)
    private float geography;
    @Basic(optional = false)
    @NotNull
    @Column(name = "computer_studies", nullable = false)
    private float computerStudies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_mark", nullable = false)
    private float totalMark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mean_mark", nullable = false)
    private float meanMark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mean_grade", nullable = false)
    private float meanGrade;
    @JoinColumn(name = "exam_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    @ManyToOne(optional = false)
    private Exam examId;
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    @ManyToOne(optional = false)
    private Student studentId;

    public Result() {
    }

    public Result(Integer id) {
        this.id = id;
    }

    public Result(Integer id, float math, float english, float kiswahili, float biology, float chemistry, float physics, float agriculture, float geography, float computerStudies, float totalMark, float meanMark, float meanGrade) {
        this.id = id;
        this.math = math;
        this.english = english;
        this.kiswahili = kiswahili;
        this.biology = biology;
        this.chemistry = chemistry;
        this.physics = physics;
        this.agriculture = agriculture;
        this.geography = geography;
        this.computerStudies = computerStudies;
        this.totalMark = totalMark;
        this.meanMark = meanMark;
        this.meanGrade = meanGrade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getKiswahili() {
        return kiswahili;
    }

    public void setKiswahili(float kiswahili) {
        this.kiswahili = kiswahili;
    }

    public float getBiology() {
        return biology;
    }

    public void setBiology(float biology) {
        this.biology = biology;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(float agriculture) {
        this.agriculture = agriculture;
    }

    public float getGeography() {
        return geography;
    }

    public void setGeography(float geography) {
        this.geography = geography;
    }

    public float getComputerStudies() {
        return computerStudies;
    }

    public void setComputerStudies(float computerStudies) {
        this.computerStudies = computerStudies;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public float getMeanMark() {
        return meanMark;
    }

    public void setMeanMark(float meanMark) {
        this.meanMark = meanMark;
    }

    public float getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(float meanGrade) {
        this.meanGrade = meanGrade;
    }

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Result)) {
            return false;
        }
        Result other = (Result) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.osmadeit.angular.entities.Result[ id=" + id + " ]";
    }
    
}
