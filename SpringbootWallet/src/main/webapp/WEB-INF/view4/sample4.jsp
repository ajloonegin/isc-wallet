<html>
   <body>
      
      <form action="#" th:action="@{/home/adminpanel/addperson/result}" method = "Post" >
         First Name: <input type = "text" name = "first_name" required/>
         <br />
         Last Name: <input type = "text" name = "last_name" required/>
		 
		 National Code: <input type = "text" name = "national_code" required/>
		 <br />
		 Date Of Birth: <input type = "text" name = "birth_date" required/>
		 
		 Mobile Number: <input type = "text" name = "mobile_number" required/>
		 <br />
		 Gender: 
		 <input type="radio" name = "female_gender"/>female
		 <input type="radio" name = "male_gender"/>male
		 
		 
		 militaryStatus: 
		 <input type="radio" name = "done"/> DONE
		 <input type="radio" name = "educational_exemption"/> EducationalExemption
		 <input type="radio" name = "permanent_exemption"/> permanentExemption
		 <input type="radio" name = "subject_to_military_service"/> SubjectToMilitaryService
		 <input type="radio" name = "in_military_progress"/> InMilitaryProgress	
		 
		 <br />
		 Email Address: <input type="email" name = "email" required/>
		 
		 <br />  
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
      
   </body>
</html>

