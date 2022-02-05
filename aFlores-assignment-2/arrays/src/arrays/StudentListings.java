/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author andres
 */
public class StudentListings {

    StudentNode[] studentArr = new StudentNode[0];

    public int getArrLength() {
        return studentArr.length;
    }

    public void appendItem(StudentNode appendMe) {

        int currSize = studentArr.length;

        // instantiate a new arr with size + 1
        StudentNode[] newArr = new StudentNode[currSize + 1];

        int i;
        for (i = 0; i < currSize; i++) {
            newArr[i] = studentArr[i];

        }
        newArr[currSize] = appendMe;
        studentArr = newArr;

    }

    public void insertAtIndex(int position, StudentNode insertMe) {
        int currSize = studentArr.length;

        // instantiate a new arr with size + 1
        StudentNode[] result = new StudentNode[currSize + 1];

        for (int i = 0, j = 0; i < studentArr.length; i++, j++) {
            if (i == position) {
                result[j] = insertMe;
                j++;
            }
            result[j] = studentArr[i];

        }
        
        studentArr = result;

    }
    
    public void deleteAtIndex(int index) {
        int currSize = studentArr.length;
        
        if (currSize == 0 || index < 0 || index >= currSize) {
            System.out.println("Invalid index");
        return;
        }
        
        StudentNode[] newArr = new StudentNode[currSize - 1];
        
        for (int i = 0, j = 0; i < currSize; i++) {
            if (i == index) {
                continue;
            }
            
            newArr[j++] = studentArr[i];
        }
        
        this.studentArr = newArr;
        
    }

    public void printArr() {
        
        for (int i = 0; i < studentArr.length; i++) {
            
            System.out.print("[" + studentArr[i].toString() + "]");
        }
        System.out.println();
    }

}
