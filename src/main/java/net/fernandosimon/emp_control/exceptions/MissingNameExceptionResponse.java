package net.fernandosimon.emp_control.exceptions;

/**
 * @author developer
 * @date 2020-01-12
 * @time 21:22
 */
public class MissingNameExceptionResponse {

    private String missingName;

    public MissingNameExceptionResponse(String missingName) {
        this.missingName = missingName;
    }

    public String getMissingName() {
        return missingName;
    }

    public void setMissingName(String missingName) {
        this.missingName = missingName;
    }
}
