/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dto.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author shana
 * @param <E>
 */
public class EmployeeTableModel<E> extends AbstractTableModel {

    private final String[] header;
    private final int[] indexes;
    private final List<Employee> data;

    public EmployeeTableModel(String[] header, int[] indexes) {
        int i;
        this.header = new String[header.length];
        for (i = 0; i < header.length; i++) {
            this.header[i] = header[i];
        }
        this.indexes = new int[indexes.length];
        for (i = 0; i < header.length; i++) {
            this.indexes[i] = indexes[i];
        }
        this.data = new ArrayList<>();
    }

    public Employee getRowData(int rowIndex) {
        return data.get(rowIndex);
    }

    public void addRow(Employee e) {
        data.add(e);
    }

    public void setRow(int rowIndex, Employee e) {
        data.set(rowIndex, e);
    }

    public void removeRow(int rowIndex) {
        data.remove(rowIndex);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return (column >= 0 && column < header.length) ? header[column] : "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= data.size() || columnIndex < 0 || columnIndex >= header.length) {
            return null;
        }
        Employee emp = data.get(rowIndex);
        switch (indexes[columnIndex]) {
            case 0:
                return emp.getCode();
            case 1:
                return emp.getName();
            case 2:
                return emp.getAddress();
            case 3:
                return emp.isSex();
            case 4:
                return emp.getSalary();
        }
        return null;
    }

}
