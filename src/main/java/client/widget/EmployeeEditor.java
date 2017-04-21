package client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import shared.Employee;

/**
 * Created by s6n on 21-04-2017.
 */
public class EmployeeEditor extends Composite implements Editor<Employee> {
    interface EmployeeUiBinder extends UiBinder<Widget, EmployeeEditor> {
    }

    private static EmployeeUiBinder ourUiBinder = GWT.create(EmployeeUiBinder.class);

    @UiField
    TextBox empName;

    @UiField
    TextBox empDesig;

    public EmployeeEditor() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    public void resetEditorFields() {
        empName.setText("");
        empDesig.setText("");
    }
}