package com.suatylmz.librarymanagementsystem.payload.messages;

public class SuccessMessages {

    private SuccessMessages(){

    }

    //Admin
    public static final String ADMIN_CREATE = "Admin is Saved";
    public static final String ADMIN_DELETE = "Admin is deleted successfully";

    //Dean
    public static final String DEAN_SAVE = "Dean is Saved";
    public static final String DEAN_UPDATE = "Dean is Updated Successfully";
    public static final String DEAN_FOUND = "Dean is Found Successfully";
    public static final String DEAN_DELETE = "Dean is Deleted Successfully";

    //Student
    public static final String STUDENT_SAVE = "Student is Saved";
    public static final String STUDENT_UPDATE = "Student is Updated Successfully";
    public static final String STUDENT_FOUND = "Student is Found Successfully";
    public static final String STUDENT_DELETE = "Student is Deleted Successfully";

    //Teacher
    public static final String TEACHER_SAVE = "Teacher is Saved";
    public static final String TEACHER_UPDATE = "Teacher is Updated Successfully";
    public static final String TEACHER_FOUND = "Teacher is Found Successfully";
    public static final String TEACHER_DELETE = "Teacher is Deleted Successfully";

    //Advisor teacher
    public static final String ADVISOR_TEACHER_DELETE = "Advisor Teacher Deleted Successfully";
}
