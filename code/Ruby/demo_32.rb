puts "-访问作用域-------------------------"

class Bird
  def fly
    
  end
  private
  def eat
    
  end
  protected
  def run
    
  end
  
  def jump
    
  end
end
puts "-----------------------"
class Bird 
  def fly
    
  end
 
  def eat
    
  end
  
  def run
    
  end
  
  def jump
    
  end
  
  private(:eat)
  protected(:run,:jump)
end
