import {  Injectable, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, PageEvent } from '@angular/material/paginator'; 
import Swal from 'sweetalert2';
import { Generic } from '../models';
import { CommonService } from '../services/common.service';
  
export abstract class CommonListarComponent<E extends Generic,S extends CommonService<E>> implements OnInit {

  titulo: string;
  lista: E[];
  protected nombreModel:string;


  totalRegistros = 0;
  paginaActual = 0;
  totalPorPagina = 5;
  pageSizeOptions: number[] = [3, 5, 10, 25, 100];



  @ViewChild(MatPaginator) paginator: MatPaginator;

  constructor(protected service: S) { }

  ngOnInit(): void {
    this.calcularRangos();
  }

  paginar(event: PageEvent): void {
    this.paginaActual = event.pageIndex;
    this.totalPorPagina = event.pageSize;
    this.calcularRangos();
  }

  private calcularRangos() {
    this.service.listarPaginas(this.paginaActual.toString(), this.totalPorPagina.toString())
      .subscribe(p => {
        this.lista = p.content as E[];
        this.totalRegistros = p.totalElements as number;
        this.paginator._intl.itemsPerPageLabel = 'Registros por página:';
      });
  }

  public eliminar(e: E): void {

    Swal.fire({
      title: 'Cuidado',
      text: "Seguro que desea eliminar?",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: "Sí, Eliminar",
      cancelButtonText: `Cancelar`
    }).then((result) => {
      if (result.isConfirmed) {

        this.service.elliminar(e.id).subscribe(() => {
          //this.alumnos = this.alumnos.filter(a => a !== alumno);
          this.calcularRangos();
          Swal.fire('Eliminado', `${this.nombreModel} ${e.nombre} eliminado con éxito`, 'success')
        })
      }
    });
  }
}
