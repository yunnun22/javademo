package java023_jdbc.part02;

import java.util.List;
import java.util.Scanner;

/*
 * 
 * MVC 패턴
 * Model: 데이터 관리
 * View: 결과를 화면에 출력
 * controller: 클라이언트 요청과 응답 처리, Model과 View를 연결해주는 역할
 * 
 */
public class Java223_jdbc {

   public static void main(String[] args) {
      DepartmentsController dController = new DepartmentsController();
      Scanner sc = new Scanner(System.in);
       System.out.printf("1 전체, 2 검색어");
       
           int input = Integer.parseInt(sc.nextLine());
           if(input==1) {
             List<DepartmentsDTO> aList = dController.departmentsAllProcess();
             display(aList);
                    
           }else if(input==2) {
    	    System.out.printf("부서입력 : ");
    	    String line = sc.nextLine();
    	    List<DepartmentsDTO> aList = dController.departmentsSearchProcess(line);
            display(aList);
    	  
      
      }
   }// end main()
   
   
   private static void display( List<DepartmentsDTO> aList) {
       for(DepartmentsDTO dto : aList) {
       System.out.printf("%d %s %d %d\n",
                      dto.getDepartment_id(),
                      dto.getDepartment_name(),
                      dto.getManager_id(),
                      dto.getLocation_id());
	   
           }
       }//display
   
}// end class