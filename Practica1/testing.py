from Practica import conseguir_nota
import unittest

class test_practica (unittest.TestCase):

    def Test_conseguir_nota(self):
        self.assertEqual(conseguir_nota(69), "A")
        self.assertEqual(conseguir_nota("hola"), False)
        self.assertEqual(conseguir_nota(56.7), False)
        self.assertEqual(conseguir_nota(-4), False)