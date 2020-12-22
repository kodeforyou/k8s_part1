execute tbe below commands:
---------------------------
  kubectl apply -f mysql-pv.yaml
  
  kubectl apply -f mysql-deployment.yaml
  
  kubectl get pods
  
  note: goto mysql pod by using below command and create a database "resource"
  
  kubectl exec -it <replace this with mysql-pod-name> bash
  
  cd ResourcesSBApp3/
  
  kubectl apply -f resource-sbapp3-dep.yml
  
  kubectl get pods
  
  kubectl get pods
  
  kubectl get deployments
  
  kubectl get services
  
  cd ResourcesConsumer4/
  
  kubectl apply -f resource-consumer4-dep.yml
  
  kubectl get pods
  
  kubectl get deployments
  
  kubectl get services
  
  

