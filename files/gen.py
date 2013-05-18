#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys
import random
import os

MAX = 100

def create_file(size):
   f = open("array-file-%d.txt" % size, "w")
   # write tam in the first line, so the program can know size of array
   f.write("%d\n" % size)
   for i in range(0, size):
      f.write("%d\n" % random.randrange(0,MAX))
   
   f.close()

if __name__ == '__main__':
   if len(sys.argv) == 1:
      print "usage: ./gen.py size"
      exit(1)
   
   os.system("rm array-file-*")
   size = int(sys.argv[1])
   for i in range(0, size):
      create_file(10 ** (i + 1))