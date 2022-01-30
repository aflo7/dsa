class Listing: 
  def __init__(self, name = " ", price = 0):
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
      
class Listings:  
  # create 100 empty listings or a user inputted amount
  def __init__(self, size = 100):
    self.data = []
    self.size = size
    
    for (item) in range(self.size):
      self.data.append(Listing())

  def addListing(self, Listing):
    self.data.append(Listing)
    
  def showAllListings(self):
    for item in self.data:
      print("Name: " + item.name + " Price: " + str(item.price))
  
  
ls = Listings()
ls.showAllListings() # should print 100 blank lines

print("----------")

ls.addListing(Listing("apple", 22)) # should print 100 blank lines and 1 defined Listing
ls.showAllListings()

print("----------")
ns = Listings(20)
ns.showAllListings() # should print 20 blank lines
