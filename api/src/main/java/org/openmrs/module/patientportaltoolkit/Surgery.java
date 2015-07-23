package org.openmrs.module.patientportaltoolkit;

import java.util.Date;

/**
 * Created by Maurya on 06/07/2015.
 */
public class Surgery {

    private String surgeryType;

    private Date surgeryDate;

    private String majorComplications;

    private Boolean hasMajorComplications;

    private String pcpName;

    private String pcpEmail;

    private String pcpPhone;

    private String institutionName;

    private String institutionCity;

    private String institutionState;

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getMajorComplications() {
        return majorComplications;
    }

    public void setMajorComplications(String majorComplications) {
        this.majorComplications = majorComplications;
    }

    public Boolean getHasMajorComplications() {
        return hasMajorComplications;
    }

    public void setHasMajorComplications(Boolean hasMajorComplications) {
        this.hasMajorComplications = hasMajorComplications;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionCity() {
        return institutionCity;
    }

    public void setInstitutionCity(String institutionCity) {
        this.institutionCity = institutionCity;
    }

    public String getInstitutionState() {
        return institutionState;
    }

    public void setInstitutionState(String institutionState) {
        this.institutionState = institutionState;
    }

    public String getPcpName() {
        return pcpName;
    }

    public void setPcpName(String pcpName) {
        this.pcpName = pcpName;
    }

    public String getPcpEmail() {
        return pcpEmail;
    }

    public void setPcpEmail(String pcpEmail) {
        this.pcpEmail = pcpEmail;
    }

    public String getPcpPhone() {
        return pcpPhone;
    }

    public void setPcpPhone(String pcpPhone) {
        this.pcpPhone = pcpPhone;
    }
}