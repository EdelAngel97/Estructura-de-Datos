import Foundation

class Fetch {
    var vector: [Int] = []
    func fetch(n: Int)->Int{
        preconditionFailure("Method must be overridden")
    }
    
    func getV()->[Int]{
        return self.v
    }
    
    func setV(v: [Int]){
        self.v = v
    }
    func randomV(n:Int)->[Int]{
        var v:[Int] = [Int]()
        for _ in 0...(n-1) {
            v.append(Int(arc4random_uniform(300)))
        }
        return v
    }
    
    func showV(){
        let count:Int = self.vector.count-1
        var string = ""
        for(index) in 0...count{
            string += String(self.v[index])
            string += ","
        }
        string = String(string.characters.dropLast()) 
        print(string)
    }
    func showF(n: Int){
        if(n == (-1)){print("El numero no se encuentra en el vector")}
        else
        {print("El numero se encuentra en la posición \(n)")}
    }
}
class binario: Fetch{
   override func fetch(n: Int) -> Int {
      var centro: Int = 0
      var inicio: Int = 0
      var fin: Int = self.vector.count-1
        
      while(inicio <= fin){
          centro = (inicio + fin)/2
            
          if(self.v[centro] == n){return centro}
            
          if(n < self.v[centro]){
             fin = centro -1
         } else {
             inicio = centro +1
          }
       }
     return -1
   }
}

class secuencial: Fetch{
    override func fetch(n: Int) -> Int {
        let count:Int = self.v.count-1
        for i in 0...count{
            if(self.v[i]==n){return i}
        }
        return -1
    }
}

var test: secuencial = secuencial()
test.setV(v: test.randomV(n: 200))
test.showV()
test.showF(n: test.fetch(n: 40))

var main2: binario = binario()
main2.setV(v: vector)
main2.showV()
main2.showF(n: main2.fetch(n: 8))
