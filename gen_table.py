#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os

ARRAY_SIZE = 6

if __name__ == '__main__':
   data = {
      0: 'Bubble',
      1: 'Insertion',
      2: 'Selection',
      3: 'Quick',
      4: 'Counting',
      5: 'Bigger Smaller'
   }
   for i in range(0, ARRAY_SIZE):
      size = 10 ** (i + 1)
      print size
      print "{:<16}  {:>11}  {:>11}  {:>11}".format("Algoritmo", "Média", "Máx.", "Mín.")
      print "{}  {}  {}  {}".format("-" * 16, "-" * 10, "-" * 10, "-" * 10)
      for j in range(0, len(data)):
         if not os.path.exists("results/%d-%d.txt" % (j, size)):
            continue
            
         f = open("results/%d-%d.txt" % (j, size), "r")
         num = float(f.readline())
         max = num
         min = num
         avg = 0
         for line in f:
            num = float(line)
            avg += num
            if num > max:
               max = num
            
            if num < min:
               min = num
         
         print "{:<16}  {:>10}  {:>10}  {:>10}".format(data[j], avg / 5.0, max, min)
         
      print ""