#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys
import random

def create_file(tam):
   f = open("array-file-%d.txt" % tam, "w")
   # write tam in the first line, so the program can know size of array
   f.write("%d\n" % tam)
   for i in range(0, tam):
      f.write("%d\n" % random.randrange(0,tam))
   
   f.close()

if __name__ == '__main__':
   tam = int(sys.argv[1])
   create_file(tam)