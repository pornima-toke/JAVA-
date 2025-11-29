# pattern.py

for i in range(1, 6):           # i = 1 to 5
    for j in range(1, 6):       # j = 1 to 5
        if i <= j:
            print("*", end="")  # print * without newline
        else:
            print(" ", end="")  # print space
    print()  # new line after inner loop
