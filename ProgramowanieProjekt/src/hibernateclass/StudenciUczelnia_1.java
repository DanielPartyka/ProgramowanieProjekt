/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateclass;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Galan
 */

//Konfiguracje tabeli

@Entity
@Table(name = "studenci_uczelnia")

public class StudenciUczelnia_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "imie")
    private String imie;
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "data_ur")
    private String dataUr;
    @Column(name = "miasto")
    private String miasto;
    @Column(name = "kod")
    private String kod;
    @Column(name = "ulica")
    private String ulica;
    @Column(name = "numer")
    private String numer;
    @Column(name = "tel")
    private String tel;
    @Column(name = "e_mail")
    private String eMail;
    @Column(name = "uczelnia")
    private String uczelnia;

    //gettery i settery
    public StudenciUczelnia_1() {
    }

    public StudenciUczelnia_1(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        String oldStudentId = this.studentId;
        this.studentId = studentId;
        changeSupport.firePropertyChange("studentId", oldStudentId, studentId);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        String oldNazwisko = this.nazwisko;
        this.nazwisko = nazwisko;
        changeSupport.firePropertyChange("nazwisko", oldNazwisko, nazwisko);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        String oldImie = this.imie;
        this.imie = imie;
        changeSupport.firePropertyChange("imie", oldImie, imie);
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        String oldPesel = this.pesel;
        this.pesel = pesel;
        changeSupport.firePropertyChange("pesel", oldPesel, pesel);
    }

    public String getDataUr() {
        return dataUr;
    }

    public void setDataUr(String dataUr) {
        String oldDataUr = this.dataUr;
        this.dataUr = dataUr;
        changeSupport.firePropertyChange("dataUr", oldDataUr, dataUr);
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        String oldMiasto = this.miasto;
        this.miasto = miasto;
        changeSupport.firePropertyChange("miasto", oldMiasto, miasto);
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        String oldKod = this.kod;
        this.kod = kod;
        changeSupport.firePropertyChange("kod", oldKod, kod);
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        String oldUlica = this.ulica;
        this.ulica = ulica;
        changeSupport.firePropertyChange("ulica", oldUlica, ulica);
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        String oldNumer = this.numer;
        this.numer = numer;
        changeSupport.firePropertyChange("numer", oldNumer, numer);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        String oldEMail = this.eMail;
        this.eMail = eMail;
        changeSupport.firePropertyChange("EMail", oldEMail, eMail);
    }

    public String getUczelnia() {
        return uczelnia;
    }

    public void setUczelnia(String uczelnia) {
        String oldUczelnia = this.uczelnia;
        this.uczelnia = uczelnia;
        changeSupport.firePropertyChange("uczelnia", oldUczelnia, uczelnia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudenciUczelnia_1)) {
            return false;
        }
        StudenciUczelnia_1 other = (StudenciUczelnia_1) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernateclass.StudenciUczelnia_1[ studentId=" + studentId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
