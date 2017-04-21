package client.view;

import client.widget.EmployeeEditor;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import shared.Employee;

/**
 * Created by s6n on 21-04-2017.
 */
public class EmployeeView extends Composite {
    interface EmployeeViewUiBinder extends UiBinder<HTMLPanel, EmployeeView> {
    }

    private static EmployeeViewUiBinder ourUiBinder = GWT.create(EmployeeViewUiBinder.class);

    interface Driver extends SimpleBeanEditorDriver<Employee, EmployeeEditor> {
    }

    Driver driver = GWT.create(Driver.class);

    Employee employee;

    @UiField
    EmployeeEditor employeeEditor;

    @UiField
    Button get;

    @UiField
    Button save;

    @UiField
    Button reset;

    public EmployeeView() {
        employee = new Employee();
        initWidget(ourUiBinder.createAndBindUi(this));
        driver.initialize(employeeEditor);
    }

    @UiHandler("get")
    public void onClickGet(ClickEvent e) {
        driver.edit(employee);
    }

    @UiHandler("save")
    public void onClickSave(ClickEvent e) {
        driver.flush();
    }

    @UiHandler("reset")
    public void onClickRest(ClickEvent e) {
        employeeEditor.resetEditorFields();
    }
}