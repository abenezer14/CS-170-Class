

class TestQueueArrayGeneric{
    public static void main(String[] args){
        QueueArrayGeneric<Car>queue1;
        queue1=new QueueArrayGeneric<Car>();
        Car car1;
        System.out.println(queue1.empty());
        queue1.enqueue(new Car(" Tesla","Model 3"));
        queue1.enqueue(new Car(" Tesla","Model X"));
       
        while(!(queue1.empty())){
            car1=queue1.dequeue();
            System.out.print(car1.getBrand());
            System.out.print(car1.getModel());
            System.out.println();
        }
        queue1.peek();
        
        queue1.enqueue(new Car(" Jeep"," Wrangler"));
        queue1.enqueue(new Car(" Chevrolet"," Camaro"));
        queue1.enqueue(new Car(" MINI"," Cooper"));
        queue1.enqueue(new Car(" Volkswagen"," Jetta"));
        
        queue1.dequeue();
        queue1.enqueue(new Car(" Toyota"," RAV4"));
        
        System.out.println(queue1.full());
         while(!(queue1.empty())){
            car1=queue1.dequeue();
            System.out.print(car1.getBrand());
            System.out.print(car1.getModel());
            System.out.println();
        }
       
        
        
    }
   
}
