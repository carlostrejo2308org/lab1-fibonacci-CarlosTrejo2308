
def fibo(x):
    if x <= 0:
        return x

    ln = [0, 1]

    while x > 1:
        ln[0], ln[1] = ln[1], ln[0] + ln[1]
        x -= 1
    return ln[1]


# Get input
x = int(input())

print(fibo(x))
