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
    
arr = []

i = 0
while (i < 3):
  name = input("Enter name: ")
  price = input("Enter price: ")
  
  newItem = Listing(name, int(price))
  arr.append(newItem)
  i += 1
  
for item in reversed(arr):
  print(item.name + ", $" + str(item.price) + ".")
  