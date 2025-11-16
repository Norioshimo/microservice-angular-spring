import { Component } from '@angular/core';
import { Alumno } from '../../models/alumno';
import { AlumnoService } from 'src/app/services/alumno.service';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonFormComponent } from '../common-form.component';

@Component({
  selector: 'app-alumnos-form',
  templateUrl: './alumnos-form.component.html',
  styleUrls: ['./alumnos-form.component.css']
})
export class AlumnosFormComponent extends CommonFormComponent<Alumno, AlumnoService> {


  constructor(service: AlumnoService,
    router: Router,
    route: ActivatedRoute
  ) {
    super(service, router, route);

    this.titulo = "Crear Alumnos";
    this.model = new Alumno();
    this.redirect = '/alumnos';
    this.nombreModel = Alumno.name;

  }
}
