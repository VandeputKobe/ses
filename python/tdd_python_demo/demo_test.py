from demo import divide
from demo import add
from demo import subtract
from demo import multiply
import unittest

class TestCalculator(unittest.TestCase):
    def test_gegevenTeller2Noemer1_wanneerdivide_dan2(self):
        result = divide(2,1)
        assert result == 2

    def test_gegevenx5y3_wanneeradd_dan8(self):
        result = add(5,3)
        assert result == 8

    def test_gegevenx5y3_wanneersubtract_dan2(self):
        result = subtract(5,3)
        assert result == 2

    def test_gegevenx5y3_wanneermultiply_dan15(self):
        result = multiply(5,3)
        assert result == 15

if __name__ == '__main__':
    unittest.main()