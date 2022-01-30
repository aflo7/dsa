

class Listing:
  name = ""
  price = 0
  
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
  
  
def calcAvg(totalPrice, numItems):
  print(totalPrice / numItems)

def processItems():
  addItem = True
  list = []

  while (addItem):
    name = input("Enter item: ")
    price = input("Enter price: ")
    
    newItem = Listing(name, price)
    
    list.append(newItem)
    
    choice = input("Add another item? y/-1 ")
    
    if (choice == "-1"):
      addItem = False
    

  peasFound = False
  totalPrice = 0

  for item in list:
    print(item.name + ", $" + item.price)
    totalPrice += int(item.price)
    
    if (item.name == "peas" or item.name == "Peas"):
      peasFound = True
    
  if (peasFound):
    print("Average price: ", calcAvg(totalPrice, len(list)))
   
   
def mainLoop():
  keepProcessing = True

  while (keepProcessing):
    processItems()
    
    choice = input("Would you like to process another set? yes/no")
    
    if (choice == "yes"):
      processItems()
    else:
      keepProcessing = False
      
      
mainLoop()
