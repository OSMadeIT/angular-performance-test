/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.angular.entities;

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
    private int math;
    @Basic(optional = false)
    @NotNull
    @Column(name = "english", nullable = false)
    private int english;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kiswahili", nullable = false)
    private int kiswahili;
    @Basic(optional = false)
    @NotNull
    @Column(name = "biology", nullable = false)
    private int biology;
    @Basic(optional = false)
    @NotNull
    @Column(name = "chemistry", nullable = false)
    private int chemistry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physics", nullable = false)
    private int physics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agriculture", nullable = false)
    private int agriculture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geography", nullable = false)
    private int geography;
    @Basic(optional = false)
    @NotNull
    @Column(name = "computer_studies", nullable = false)
    private int computerStudies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_mark", nullable = false)
    private int totalMark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mean_mark", nullable = false)
    private int meanMark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mean_grade", nullable = false)
    private int meanGrade;
    @JoinColumn(name = "exam_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Exam examId;
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Student studentId;

    public Result() {
    }

    public Result(Integer id) {
        this.id = id;
    }

    public Result(Integer id, int math, int english, int kiswahili, int biology, int chemistry, int physics, int agriculture, int geography, int computerStudies, int totalMark, int meanMark, int meanGrade) {
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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getKiswahili() {
        return kiswahili;
    }

    public void setKiswahili(int kiswahili) {
        this.kiswahili = kiswahili;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(int agriculture) {
        this.agriculture = agriculture;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getComputerStudies() {
        return computerStudies;
    }

    public void setComputerStudies(int computerStudies) {
        this.computerStudies = computerStudies;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getMeanMark() {
        return meanMark;
    }

    public void setMeanMark(int meanMark) {
        this.meanMark = meanMark;
    }

    public int getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(int meanGrade) {
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
