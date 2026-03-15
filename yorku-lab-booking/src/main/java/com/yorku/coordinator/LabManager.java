package com.yorku.coordinator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yorku.equipment.Equipment;

public class LabManager {
    private String name;
    private Map<String, Equipment> equipmentMap = new HashMap<>();

    public LabManager(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addEquipment(Equipment equipment) {
        equipmentMap.put(equipment.getId(), equipment);
        System.out.println("Equipment added: " + equipment.getDescription());
    }

    public void enableEquipment(String id) {
        Equipment eq = equipmentMap.get(id);
        if (eq != null) eq.setAvailable(true);
    }

    public void disableEquipment(String id) {
        Equipment eq = equipmentMap.get(id);
        if (eq != null) eq.setAvailable(false);
    }

    public void markForMaintenance(String id) {
        Equipment eq = equipmentMap.get(id);
        if (eq != null) eq.setAvailable(false);
    }

    public Equipment getEquipment(String id) {
        return equipmentMap.get(id);
    }

    // ✅ New method: return only available equipment
    public List<Equipment> getAvailableEquipment() {
        List<Equipment> availableList = new ArrayList<>();
        for (Equipment eq : equipmentMap.values()) {
            if (eq.isAvailable()) {
                availableList.add(eq);
            }
        }
        return availableList;
    }
    public Equipment getEquipmentById(String id) {
    return equipmentMap.get(id); // returns the Equipment object
    }

    public Collection<Equipment> getAllEquipment() {
    return equipmentMap.values(); // returns all Equipment objects
    }

    // Optional: return all equipment IDs for ComboBoxes
    public List<String> getAllEquipmentIds() {
        return new ArrayList<>(equipmentMap.keySet());
    }
}