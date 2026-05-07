from python.src.data_structures.mathematics.get_gcd import get_gcd


def get_lcm(a: int, b: int):
    if a == 0 or b == 0:
        return 0
    return abs(a * b) // get_gcd(a, b)
