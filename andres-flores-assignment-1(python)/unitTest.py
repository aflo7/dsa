class Listing:
  def __init__(self):
      self.name = ""
      self.price = 0

  def __init__(self, name, price):
      self.name = name
      self.price = price

  def get_name(self):
      return self.name
    
  def get_price(self):
      return self.price
      
  def set_name(self, name):
      self.name = name
  
  def set_price(self, price):
    self.price = price
    

# if unit test passes, nothing is output to console. If error occurs, the line after the comma prints to console

def testGetName():
  item = Listing("apple", 22)
  assert item.name == "apple", "Result: " + item.name + " Expected: apple"

def testGetPrice():
  item = Listing("apple", 22)
  assert item.price == 22, "Result: " + item.price + " Expected: 22"
  
def testSetName():
  item = Listing("apple", 22)
  item.set_name("banana")
  assert item.name == "banana", "Result: " + item.name + " Expected: banana"

def testSetPrice():
  item = Listing("apple", 22)
  item.set_price(44)
  assert item.price == 44, "Result: " + item.price + " Expected: 44"
  
testGetName()
testGetPrice()
testSetName()
testSetPrice()