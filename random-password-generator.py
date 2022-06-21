import random

lower = "abcefghijklmnopqrstuvwxyz"
upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
number = "0123456789"
symbol = "~`!@#$%^&*()_-+=[]{}|\<,>.?*/"

all = lower + upper + number + symbol
length = int(input("Enter the length:\n"))

password = "".join(random.sample(all, length))
print(password)