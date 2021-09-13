pipeline {

    agent any
    
    stages{
    
        stage("build"){
          
          steps{
            echo "building an aplication.."
            sh mvn clean package -DskipTests=true
          }
        
        }
        
           stage("test"){
          
          steps{
           echo "testing an aplication.."
          }
        
        }
    
    
    
       stage("deploy"){
          
          steps{
           echo "deploying an aplication.."
          }
        
        }
    
    
    
    
    
    }
  
}
