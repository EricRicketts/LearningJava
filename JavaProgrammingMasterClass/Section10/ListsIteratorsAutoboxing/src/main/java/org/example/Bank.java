package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public boolean addBranch(String branchName) {
        boolean branchAdded = false;
        Branch branch = findBranch(branchName);
        if (Objects.isNull(branch)) {
            branches.add(new Branch(branchName));
            branchAdded = true;
        }
        return branchAdded;
    }

    
    private Branch findBranch(String branchName) {
        Branch branch = null;
        for (Branch currentBranch : branches) {
            if (currentBranch.getName().equalsIgnoreCase(branchName)) {
                branch = currentBranch;
                break;
            }
        }
        return branch;
    }

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }
}
