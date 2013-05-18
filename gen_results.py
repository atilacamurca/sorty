#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os

ARRAY_SIZE = 6

if __name__ == '__main__':
   data = {
      0: 'bubble',
      1: 'insertion',
      2: 'selection',
      3: 'quick',
      4: 'counting',
      5: 'bigger smaller'
   }
   # clear results/ directory
   os.system("rm results/*")
   for i in range(0, len(data)):
      for j in range(0, ARRAY_SIZE):
         if (i == 0 or i == 1 or i == 2 or i == 5) and j == ARRAY_SIZE - 1:
            continue
			
         count = 10 ** (j + 1)
         for k in range(0, 5):
            print "alg:%s size:%d iter:%d file:%d-%d" % (data[i], count, k, i, count)
            os.system("time -a -o results/%d-%d.txt -f \"%%e\" ./sorty sort %d %d" % (i, count, i, count))

